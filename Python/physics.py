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
game.display.set_caption("\"Physics\"")

#Main function
def main():    
    cubes = []
    velocities = []
    positions = []
    
    for i in range(0, 4096):
        #Creates cubes at random positions
        cubes.append(game.Rect(0, 0, 5, 5))
        
        positions.append([SCREEN_SIZE[0] / 2 - 1, SCREEN_SIZE[1] / 2 - 1])
        
        #Assigns random velocity
        rad = 2 * i / 2048 * math.pi
        velocities.append([math.cos(rad) * 64, math.sin(rad) * 64])
    
    done = False
    clock = game.time.Clock()
    
    while not done:
        deltaTime = clock.get_time() / 1000
        
        #<--- User input -->
        for event in game.event.get():
            if event.type == game.QUIT:
                done = True
        
        #<--- Game logic --->
        for i in range(0, len(cubes)):
            if cubes[i].left < 0 or cubes[i].right > SCREEN_SIZE[0] - cubes[i].width:
                velocities[i][0] *= -1
            
            if cubes[i].top < 0 or cubes[i].bottom > SCREEN_SIZE[1] - cubes[i].height:
                velocities[i][1] *= -1
            
            positions[i][0] += velocities[i][0] * deltaTime
            positions[i][1] += velocities[i][1] * deltaTime
            
            cubes[i].topleft = positions[i]
        
        fpsText = font.render(str(round(clock.get_fps())) + " FPS", True, GREEN)
        
        #<--- Game renders --->
        screen.fill(BLACK)
        
        for cube in cubes:
            game.draw.rect(screen, PURPLE, cube)
        
        screen.blit(fpsText, (0,0))
        
        game.display.flip()
        clock.tick()
    game.quit()
main()