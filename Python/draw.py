import math, pygame as game
from random import randint, uniform

#Initializes game engine
game.init()

#Defines colors
BLACK    = (   0,   0,   0)
WHITE    = ( 255, 255, 255)
GREEN    = (   0, 255,   0)
YELLOW   = ( 255, 255,   0)
ORANGE   = ( 255, 128,   0)
RED      = ( 255,   0,   0)
PURPLE   = ( 255,   0, 255)
BLUE     = (   0,   0, 255)

font = game.font.SysFont("consolas", 24)

#Creates screen
SCREEN_SIZE = (800, 800)
screen = game.display.set_mode(SCREEN_SIZE)
game.display.set_caption("Draw")

#Main function
def main():    
    points = []
    
    done = False
    clock = game.time.Clock()
    
    width = 2
    
    while not done:
        deltaTime = clock.get_time() / 1000.0
        
        #<--- User input -->
        for event in game.event.get():
            if event.type == game.QUIT:
                done = True
            elif event.type == game.KEYDOWN:
                if event.key == game.K_c:
                    points = []
                if event.key == game.K_LEFTBRACKET:
                    width -= 2
                    width = max(width, 2)
                if event.key == game.K_RIGHTBRACKET:
                    width += 2
                    width = min(width, 32)
        
        #<--- Game logic --->
        mousePos = game.mouse.get_pos()
        
        if game.mouse.get_pressed()[0]:
            points.append(game.mouse.get_pos())
       
        fpsText = font.render(str(round(clock.get_fps())) + " FPS", True, GREEN)
        widthText = font.render(str(width) + " PX", True, GREEN)
        
        #<--- Game renders --->
        screen.fill(WHITE)
        if(len(points) > 1):
            game.draw.lines(screen, BLACK, False, points, width)
        screen.blit(fpsText, (0,0))
        screen.blit(widthText, (0, 30))
        
        
        game.display.flip()
        clock.tick()
    game.quit()
main()