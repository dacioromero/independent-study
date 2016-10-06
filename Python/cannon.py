import math, pygame as game
from random import randint, uniform

#Initializes game engine
game.init()

#Defines colorsS
BLACK    = (   0,   0,   0)
GRAY     = ( 127, 127, 127)
WHITE    = ( 255, 255, 255)
GREEN    = (   0, 255,   0)
YELLOW   = ( 255, 255,   0)
ORANGE   = ( 255, 128,   0)
RED      = ( 255,   0,   0)
PURPLE   = ( 255,   0, 255)
BLUE     = (   0,   0, 255)
BROWN    = ( 150, 111,  51)
SKY      = ( 135, 206, 235)
GRASS    = (   1, 142,  14)

font = game.font.SysFont("consolas", 24)

#Creates screen
SCREEN_SIZE = (800, 800)
screen = game.display.set_mode(SCREEN_SIZE)
game.display.set_caption("\"Cannon\"")

#Main function
def main():
    refPoints = ((-20, -20), (-20, 0), (60, 0), (60, -20))
    
    done = False
    clock = game.time.Clock()
    rad = 0
    
    while not done:
        deltaTime = clock.get_time() / 1000
        
        #<--- User input -->
        for event in game.event.get():
            if event.type == game.QUIT:
                done = True
        
        keys = game.key.get_pressed();
        
        if(keys[game.K_q] or keys[game.K_LEFT]):
            rad -= deltaTime * 4
        
        if(keys[game.K_e] or keys[game.K_RIGHT]):
            rad += deltaTime * 4
        
        #<--- Game logic --->
        
        points = []
        for i in range(0, len(refPoints)):
            sin = math.sin(rad)
            cos = math.cos(rad)
            
            points.append((refPoints[i][0] * cos - refPoints[i][1] * sin + 400, refPoints[i][0] * sin + refPoints[i][1] * cos + 400))
        
        
        fpsText = font.render(str(round(clock.get_fps())) + " FPS", True, GREEN)
        
        #<--- Game renders --->
        screen.fill(SKY)
        
        game.draw.rect(screen, GRASS, game.Rect(0, 400, 800, 400))
        game.draw.polygon(screen, GRAY, points)
        game.draw.circle(screen, BROWN, (400, 400), 20)
        
        screen.blit(fpsText, (0, 0))
        
        game.display.flip()
        clock.tick()
    game.quit()
main()